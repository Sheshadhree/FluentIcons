package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnRightLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnRightLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.944f, 9.893f)
            curveTo(8.174f, 9.586f, 7.8f, 8.713f, 8.107f, 7.944f)
            curveToRelative(0.307f, -0.77f, 1.18f, -1.144f, 1.95f, -0.837f)
            lineToRelative(31.552f, 12.595f)
            curveToRelative(2.078f, 0.83f, 2.104f, 3.76f, 0.042f, 4.627f)
            lineTo(12.393f, 36.622f)
            lineToRelative(7.728f, 3.513f)
            curveToRelative(0.754f, 0.343f, 1.088f, 1.232f, 0.745f, 1.986f)
            curveToRelative(-0.343f, 0.754f, -1.232f, 1.088f, -1.986f, 0.745f)
            lineToRelative(-11f, -5f)
            curveToRelative(-0.738f, -0.335f, -1.076f, -1.195f, -0.764f, -1.943f)
            lineToRelative(5f, -12f)
            curveToRelative(0.318f, -0.764f, 1.197f, -1.126f, 1.961f, -0.807f)
            curveToRelative(0.765f, 0.318f, 1.127f, 1.197f, 0.808f, 1.961f)
            lineToRelative(-3.659f, 8.781f)
            lineToRelative(28.137f, -11.822f)
            lineTo(8.944f, 9.893f)
            close()
        }
    }.build()
}
