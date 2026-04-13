package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 2.75f)
            curveTo(21f, 2.336f, 20.664f, 2f, 20.25f, 2f)
            reflectiveCurveTo(19.5f, 2.336f, 19.5f, 2.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(21f, 21.664f, 21f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(15.75f, 4f)
            curveTo(16.993f, 4f, 18f, 5.007f, 18f, 6.25f)
            verticalLineToRelative(2.5f)
            curveTo(18f, 9.993f, 16.993f, 11f, 15.75f, 11f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 11f, 3f, 9.993f, 3f, 8.75f)
            verticalLineToRelative(-2.5f)
            curveTo(3f, 5.007f, 4.007f, 4f, 5.25f, 4f)
            horizontalLineToRelative(10.5f)
            close()
            moveToRelative(0f, 9f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-2.5f)
            curveTo(6.5f, 14.007f, 7.507f, 13f, 8.75f, 13f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}
