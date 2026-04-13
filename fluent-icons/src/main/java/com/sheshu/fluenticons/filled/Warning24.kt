package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Warning24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Warning24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.03f, 3.659f)
            curveToRelative(0.856f, -1.548f, 3.081f, -1.548f, 3.937f, 0f)
            lineToRelative(7.746f, 14.001f)
            curveToRelative(0.83f, 1.5f, -0.255f, 3.34f, -1.969f, 3.34f)
            horizontalLineTo(4.254f)
            curveToRelative(-1.715f, 0f, -2.8f, -1.84f, -1.97f, -3.34f)
            lineToRelative(7.746f, -14f)
            close()
            moveTo(12.997f, 17f)
            curveToRelative(0f, -0.552f, -0.447f, -0.999f, -0.998f, -0.999f)
            curveTo(11.447f, 16.001f, 11f, 16.448f, 11f, 17f)
            reflectiveCurveToRelative(0.447f, 1f, 0.999f, 1f)
            curveToRelative(0.551f, 0f, 0.998f, -0.448f, 0.998f, -1f)
            close()
            moveToRelative(-0.259f, -7.853f)
            curveTo(12.688f, 8.782f, 12.374f, 8.5f, 11.995f, 8.5f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            lineToRelative(0.004f, 4.502f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0.05f, 0.366f, 0.364f, 0.648f, 0.743f, 0.648f)
            curveToRelative(0.415f, 0f, 0.75f, -0.337f, 0.75f, -0.751f)
            lineToRelative(-0.004f, -4.502f)
            lineToRelative(-0.007f, -0.101f)
            close()
        }
    }.build()
}
