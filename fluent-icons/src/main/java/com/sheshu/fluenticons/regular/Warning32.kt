package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Warning32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Warning32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 22f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(16f, 9f)
            curveToRelative(-0.553f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.447f, 1f, 1f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-3.064f, -5.191f)
            curveToRelative(1.332f, -2.41f, 4.796f, -2.41f, 6.128f, 0f)
            lineToRelative(10.493f, 18.999f)
            curveTo(30.846f, 25.14f, 29.158f, 28f, 26.494f, 28f)
            horizontalLineTo(5.507f)
            curveToRelative(-2.665f, 0f, -4.352f, -2.86f, -3.064f, -5.192f)
            lineToRelative(10.493f, -19f)
            close()
            moveToRelative(4.377f, 0.967f)
            curveToRelative(-0.57f, -1.033f, -2.055f, -1.033f, -2.626f, 0f)
            lineTo(4.194f, 23.775f)
            curveTo(3.642f, 24.775f, 4.364f, 26f, 5.507f, 26f)
            horizontalLineToRelative(20.986f)
            curveToRelative(1.143f, 0f, 1.866f, -1.226f, 1.314f, -2.225f)
            lineToRelative(-10.494f, -19f)
            close()
        }
    }.build()
}
