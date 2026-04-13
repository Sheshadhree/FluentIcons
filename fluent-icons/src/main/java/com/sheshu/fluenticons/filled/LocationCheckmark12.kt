package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationCheckmark12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationCheckmark12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveTo(1.5f, 2.515f, 1.5f, 5f)
            curveToRelative(0f, 1.863f, 1.42f, 3.815f, 4.2f, 5.9f)
            curveToRelative(0.178f, 0.133f, 0.422f, 0.133f, 0.6f, 0f)
            curveToRelative(2.78f, -2.085f, 4.2f, -4.037f, 4.2f, -5.9f)
            close()
            moveTo(8.354f, 3.397f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(5.5f, 5.543f)
            lineToRelative(2.146f, -2.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
