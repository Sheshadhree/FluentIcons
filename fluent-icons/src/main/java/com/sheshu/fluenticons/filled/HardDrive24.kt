package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HardDrive24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDrive24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.44f, 4f)
            curveTo(6.579f, 4f, 5.792f, 4.493f, 5.416f, 5.27f)
            lineTo(2.73f, 10.821f)
            curveTo(3.194f, 10.615f, 3.71f, 10.5f, 4.25f, 10.5f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.541f, 0f, 1.056f, 0.115f, 1.52f, 0.321f)
            lineTo(18.586f, 5.27f)
            curveTo(18.209f, 4.493f, 17.422f, 4f, 16.559f, 4f)
            horizontalLineTo(7.441f)
            close()
            moveToRelative(12.31f, 8f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
            verticalLineToRelative(-2.5f)
            curveTo(2f, 13.007f, 3.007f, 12f, 4.25f, 12f)
            horizontalLineToRelative(15.5f)
            close()
            moveToRelative(-1.25f, 4.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
