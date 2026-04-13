package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.75f)
            curveTo(3f, 2.336f, 3.336f, 2f, 3.75f, 2f)
            reflectiveCurveTo(4.5f, 2.336f, 4.5f, 2.75f)
            verticalLineToRelative(18.5f)
            curveTo(4.5f, 21.664f, 4.164f, 22f, 3.75f, 22f)
            reflectiveCurveTo(3f, 21.664f, 3f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(8.25f, 4f)
            curveTo(7.007f, 4f, 6f, 5.007f, 6f, 6.25f)
            verticalLineToRelative(2.5f)
            curveTo(6f, 9.993f, 7.007f, 11f, 8.25f, 11f)
            horizontalLineToRelative(10.5f)
            curveTo(19.993f, 11f, 21f, 9.993f, 21f, 8.75f)
            verticalLineToRelative(-2.5f)
            curveTo(21f, 5.007f, 19.993f, 4f, 18.75f, 4f)
            horizontalLineTo(8.25f)
            close()
            moveToRelative(0f, 9f)
            curveTo(7.007f, 13f, 6f, 14.007f, 6f, 15.25f)
            verticalLineToRelative(2.5f)
            curveTo(6f, 18.993f, 7.007f, 20f, 8.25f, 20f)
            horizontalLineToRelative(7f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
