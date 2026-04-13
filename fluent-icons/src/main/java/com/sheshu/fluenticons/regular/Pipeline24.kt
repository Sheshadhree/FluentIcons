package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pipeline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pipeline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            curveToRelative(1.158f, 0f, 2.112f, 0.875f, 2.236f, 2f)
            horizontalLineToRelative(11.028f)
            curveToRelative(0.124f, -1.125f, 1.078f, -2f, 2.236f, -2f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            curveToRelative(-1.158f, 0f, -2.112f, -0.875f, -2.236f, -2f)
            horizontalLineTo(6.486f)
            curveToRelative(-0.124f, 1.125f, -1.078f, 2f, -2.236f, 2f)
            curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(3f, 0f)
            curveTo(5f, 5.836f, 4.664f, 5.5f, 4.25f, 5.5f)
            reflectiveCurveTo(3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(5f, 17.164f, 5f, 16.75f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(1.5f, 9.25f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(-11f)
            verticalLineToRelative(8f)
            close()
            moveToRelative(14f, -9.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(19f, 5.836f, 19f, 6.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}
