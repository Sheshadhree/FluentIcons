package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Diversity48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Diversity48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(16.6757f, 17.5601f),
                end = Offset(38.7431f, 40.0332f)
            )
        ) {
            moveTo(34.895f, 25.272f)
            curveToRelative(-0.542f, -0.313f, -1.209f, -0.313f, -1.75f, 0f)
            lineToRelative(-6.255f, 3.611f)
            curveToRelative(-0.542f, 0.313f, -0.875f, 0.89f, -0.875f, 1.516f)
            verticalLineToRelative(7.222f)
            curveToRelative(0f, 0.625f, 0.333f, 1.203f, 0.875f, 1.516f)
            lineToRelative(6.255f, 3.611f)
            curveToRelative(0.541f, 0.313f, 1.208f, 0.313f, 1.75f, 0f)
            lineToRelative(6.255f, -3.611f)
            curveToRelative(0.541f, -0.313f, 0.875f, -0.89f, 0.875f, -1.516f)
            verticalLineTo(30.4f)
            curveToRelative(0f, -0.626f, -0.334f, -1.203f, -0.875f, -1.516f)
            lineToRelative(-6.255f, -3.611f)
            close()
            moveTo(14f, 26f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            close()
            moveTo(30.75f, 6f)
            curveTo(28.127f, 6f, 26f, 8.127f, 26f, 10.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 2.623f, 2.127f, 4.75f, 4.75f, 4.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            verticalLineToRelative(-6.5f)
            curveTo(42f, 8.127f, 39.873f, 6f, 37.25f, 6f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(16.904f, 7.797f)
            curveTo(15.7f, 5.4f, 12.31f, 5.4f, 11.105f, 7.797f)
            lineToRelative(-4.743f, 9.432f)
            curveTo(5.262f, 19.413f, 6.835f, 22f, 9.262f, 22f)
            horizontalLineToRelative(9.487f)
            curveToRelative(2.426f, 0f, 3.998f, -2.587f, 2.899f, -4.771f)
            lineToRelative(-4.744f, -9.432f)
            close()
        }
    }.build()
}
