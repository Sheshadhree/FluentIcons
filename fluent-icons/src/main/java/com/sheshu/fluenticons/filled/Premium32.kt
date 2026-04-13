package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Premium32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Premium32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 4f)
            curveTo(6.52f, 4f, 6.084f, 4.274f, 5.875f, 4.706f)
            lineToRelative(-3.75f, 7.75f)
            curveToRelative(-0.211f, 0.436f, -0.151f, 0.954f, 0.154f, 1.33f)
            lineToRelative(12.75f, 15.75f)
            curveTo(15.266f, 29.83f, 15.623f, 30f, 16f, 30f)
            reflectiveCurveToRelative(0.734f, -0.17f, 0.972f, -0.463f)
            lineToRelative(12.75f, -15.75f)
            curveToRelative(0.304f, -0.377f, 0.364f, -0.896f, 0.153f, -1.332f)
            lineToRelative(-3.75f, -7.75f)
            curveTo(25.916f, 4.276f, 25.48f, 4f, 25f, 4f)
            horizontalLineTo(7f)
            close()
            moveToRelative(-1.636f, 7.5f)
            lineToRelative(2.42f, -5f)
            horizontalLineToRelative(3.688f)
            lineToRelative(-1.563f, 5f)
            horizontalLineTo(5.364f)
            close()
            moveTo(5.668f, 14f)
            horizontalLineToRelative(4.098f)
            lineToRelative(2.868f, 8.606f)
            lineTo(5.668f, 14f)
            close()
            moveToRelative(6.733f, 0f)
            horizontalLineToRelative(7.198f)
            lineTo(16f, 24.797f)
            lineTo(12.401f, 14f)
            close()
            moveToRelative(9.833f, 0f)
            horizontalLineToRelative(4.098f)
            lineToRelative(-6.966f, 8.606f)
            lineTo(22.234f, 14f)
            close()
            moveToRelative(4.402f, -2.5f)
            horizontalLineTo(22.09f)
            lineToRelative(-1.563f, -5f)
            horizontalLineToRelative(3.688f)
            lineToRelative(2.42f, 5f)
            close()
            moveToRelative(-7.164f, 0f)
            horizontalLineToRelative(-6.944f)
            lineToRelative(1.563f, -5f)
            horizontalLineToRelative(3.818f)
            lineToRelative(1.563f, 5f)
            close()
        }
    }.build()
}
