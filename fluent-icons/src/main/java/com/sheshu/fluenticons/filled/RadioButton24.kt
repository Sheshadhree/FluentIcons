package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RadioButton24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RadioButton24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 1.999f)
            curveToRelative(5.524f, 0f, 10.002f, 4.478f, 10.002f, 10.002f)
            curveToRelative(0f, 5.523f, -4.478f, 10.001f, -10.002f, 10.001f)
            curveToRelative(-5.524f, 0f, -10.002f, -4.478f, -10.002f, -10.001f)
            curveTo(1.998f, 6.477f, 6.476f, 1.999f, 12f, 1.999f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.695f, 0f, -8.502f, 3.806f, -8.502f, 8.502f)
            curveToRelative(0f, 4.695f, 3.807f, 8.501f, 8.502f, 8.501f)
            reflectiveCurveToRelative(8.502f, -3.806f, 8.502f, -8.501f)
            curveToRelative(0f, -4.696f, -3.807f, -8.502f, -8.502f, -8.502f)
            close()
            moveToRelative(-0.004f, 2.5f)
            curveToRelative(3.313f, 0f, 5.999f, 2.686f, 5.999f, 5.998f)
            curveToRelative(0f, 3.313f, -2.686f, 5.998f, -5.999f, 5.998f)
            curveToRelative(-3.312f, 0f, -5.998f, -2.685f, -5.998f, -5.998f)
            reflectiveCurveTo(8.684f, 6f, 11.996f, 6f)
            close()
        }
    }.build()
}
