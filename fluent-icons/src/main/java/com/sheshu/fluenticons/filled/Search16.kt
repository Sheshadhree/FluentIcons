package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Search16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Search16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.823f, 10.883f)
            curveTo(8.9f, 11.584f, 7.748f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 9.538f, 1f, 6.5f)
            reflectiveCurveTo(3.462f, 1f, 6.5f, 1f)
            reflectiveCurveTo(12f, 3.462f, 12f, 6.5f)
            curveToRelative(0f, 1.248f, -0.416f, 2.4f, -1.117f, 3.323f)
            lineToRelative(2.897f, 2.897f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.897f, -2.897f)
            close()
            moveTo(10.5f, 6.5f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            close()
        }
    }.build()
}
