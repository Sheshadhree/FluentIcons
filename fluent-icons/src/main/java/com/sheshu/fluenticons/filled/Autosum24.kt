package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Autosum24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Autosum24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.83f, 4.61f)
            curveTo(4.985f, 4.24f, 5.347f, 4f, 5.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(8.11f)
            lineToRelative(4.95f, 5.115f)
            curveToRelative(0.358f, 0.371f, 0.376f, 0.954f, 0.04f, 1.346f)
            lineTo(7.924f, 18.5f)
            horizontalLineTo(18.25f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(5.75f)
            curveToRelative(-0.39f, 0f, -0.745f, -0.227f, -0.909f, -0.582f)
            curveToRelative(-0.163f, -0.355f, -0.104f, -0.772f, 0.15f, -1.069f)
            lineToRelative(5.998f, -6.998f)
            lineTo(5.03f, 5.695f)
            curveTo(4.752f, 5.407f, 4.673f, 4.98f, 4.83f, 4.61f)
            close()
        }
    }.build()
}
