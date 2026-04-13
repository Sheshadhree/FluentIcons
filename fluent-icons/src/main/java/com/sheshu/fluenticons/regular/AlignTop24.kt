package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AlignTop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignTop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 3f)
            curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
            reflectiveCurveTo(2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineToRelative(18.5f)
            curveTo(21.664f, 4.5f, 22f, 4.164f, 22f, 3.75f)
            reflectiveCurveTo(21.664f, 3f, 21.25f, 3f)
            horizontalLineTo(2.75f)
            close()
            moveTo(4f, 8.25f)
            curveTo(4f, 7.007f, 5.007f, 6f, 6.25f, 6f)
            horizontalLineToRelative(2.5f)
            curveTo(9.993f, 6f, 11f, 7.007f, 11f, 8.25f)
            verticalLineToRelative(10.5f)
            curveTo(11f, 19.993f, 9.993f, 21f, 8.75f, 21f)
            horizontalLineToRelative(-2.5f)
            curveTo(5.007f, 21f, 4f, 19.993f, 4f, 18.75f)
            verticalLineTo(8.25f)
            close()
            moveTo(6.25f, 7.5f)
            curveTo(5.836f, 7.5f, 5.5f, 7.836f, 5.5f, 8.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(8.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.5f)
            close()
            moveTo(13f, 8.25f)
            curveTo(13f, 7.007f, 14.007f, 6f, 15.25f, 6f)
            horizontalLineToRelative(2.5f)
            curveTo(18.993f, 6f, 20f, 7.007f, 20f, 8.25f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(2.25f, -0.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
