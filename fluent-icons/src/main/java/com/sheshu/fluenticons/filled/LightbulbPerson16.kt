package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LightbulbPerson16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LightbulbPerson16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.515f, 2f, 3.5f, 4.015f, 3.5f, 6.5f)
            curveToRelative(0f, 1.256f, 0.515f, 2.393f, 1.345f, 3.208f)
            curveTo(4.94f, 9.803f, 5f, 9.902f, 5.025f, 9.995f)
            lineToRelative(0.14f, 0.51f)
            curveTo(5.939f, 9.877f, 6.925f, 9.5f, 8f, 9.5f)
            reflectiveCurveToRelative(2.061f, 0.377f, 2.835f, 1.005f)
            lineToRelative(0.14f, -0.51f)
            curveToRelative(0.025f, -0.093f, 0.084f, -0.191f, 0.18f, -0.287f)
            curveTo(11.985f, 8.893f, 12.5f, 7.756f, 12.5f, 6.5f)
            curveTo(12.5f, 4.015f, 10.485f, 2f, 8f, 2f)
            close()
            moveTo(5.573f, 12f)
            lineTo(5.46f, 11.59f)
            curveTo(6.1f, 10.92f, 7.001f, 10.5f, 8f, 10.5f)
            curveToRelative(1f, 0f, 1.901f, 0.419f, 2.539f, 1.09f)
            lineTo(10.427f, 12f)
            horizontalLineTo(5.573f)
            close()
            moveToRelative(0.276f, 1f)
            curveToRelative(0.21f, 0.595f, 0.775f, 1f, 1.415f, 1f)
            horizontalLineToRelative(1.472f)
            curveToRelative(0.64f, 0f, 1.204f, -0.405f, 1.414f, -1f)
            horizontalLineToRelative(-4.3f)
            close()
            moveTo(7f, 6.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, -2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            close()
        }
    }.build()
}
