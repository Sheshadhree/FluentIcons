package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CoinStack20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CoinStack20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 6f)
            curveToRelative(0f, 2.21f, -2.686f, 4f, -6f, 4f)
            reflectiveCurveTo(4f, 8.21f, 4f, 6f)
            reflectiveCurveToRelative(2.686f, -4f, 6f, -4f)
            reflectiveCurveToRelative(6f, 1.79f, 6f, 4f)
            close()
            moveToRelative(-0.25f, 2.853f)
            curveTo(14.485f, 10.15f, 12.38f, 11f, 10f, 11f)
            reflectiveCurveToRelative(-4.485f, -0.85f, -5.75f, -2.147f)
            curveTo(4.088f, 9.216f, 4f, 9.6f, 4f, 10f)
            curveToRelative(0f, 2.21f, 2.686f, 4f, 6f, 4f)
            reflectiveCurveToRelative(6f, -1.79f, 6f, -4f)
            curveToRelative(0f, -0.399f, -0.088f, -0.784f, -0.25f, -1.147f)
            close()
            moveToRelative(0f, 4f)
            curveTo(14.485f, 14.15f, 12.38f, 15f, 10f, 15f)
            reflectiveCurveToRelative(-4.485f, -0.85f, -5.75f, -2.147f)
            curveTo(4.088f, 13.216f, 4f, 13.6f, 4f, 14f)
            curveToRelative(0f, 2.21f, 2.686f, 4f, 6f, 4f)
            reflectiveCurveToRelative(6f, -1.79f, 6f, -4f)
            curveToRelative(0f, -0.399f, -0.088f, -0.784f, -0.25f, -1.147f)
            close()
        }
    }.build()
}
