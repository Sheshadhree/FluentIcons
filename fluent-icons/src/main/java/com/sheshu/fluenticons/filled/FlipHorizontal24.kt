package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.837f, 19.547f)
            curveTo(21.652f, 19.83f, 21.337f, 20f, 21f, 20f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.473f, 0.332f, -0.882f, 0.795f, -0.979f)
            curveToRelative(0.464f, -0.097f, 0.931f, 0.145f, 1.121f, 0.578f)
            lineToRelative(7f, 16f)
            curveToRelative(0.135f, 0.31f, 0.106f, 0.666f, -0.08f, 0.948f)
            close()
            moveTo(15f, 7.781f)
            verticalLineTo(18f)
            horizontalLineToRelative(4.471f)
            lineTo(15f, 7.78f)
            close()
            moveTo(2.5f, 20f)
            curveToRelative(-0.171f, 0f, -0.33f, -0.087f, -0.422f, -0.232f)
            curveToRelative(-0.092f, -0.145f, -0.103f, -0.326f, -0.03f, -0.48f)
            lineToRelative(8f, -17f)
            curveToRelative(0.1f, -0.213f, 0.333f, -0.327f, 0.561f, -0.276f)
            curveTo(10.838f, 2.063f, 11f, 2.266f, 11f, 2.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-8f)
            close()
        }
    }.build()
}
