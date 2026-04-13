package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnDownUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnDownUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(38.866f, 6.88f)
            curveToRelative(-0.335f, -0.738f, -1.195f, -1.076f, -1.943f, -0.764f)
            lineToRelative(-12f, 5f)
            curveToRelative(-0.764f, 0.318f, -1.126f, 1.197f, -0.807f, 1.961f)
            curveToRelative(0.318f, 0.765f, 1.197f, 1.127f, 1.961f, 0.808f)
            lineToRelative(8.781f, -3.659f)
            lineToRelative(-11.822f, 28.137f)
            lineTo(10.893f, 7.944f)
            curveToRelative(-0.307f, -0.77f, -1.18f, -1.144f, -1.949f, -0.837f)
            curveToRelative(-0.77f, 0.307f, -1.144f, 1.18f, -0.837f, 1.95f)
            lineToRelative(12.595f, 31.552f)
            curveToRelative(0.83f, 2.078f, 3.76f, 2.104f, 4.627f, 0.042f)
            lineToRelative(12.293f, -29.258f)
            lineToRelative(3.513f, 7.728f)
            curveToRelative(0.343f, 0.754f, 1.232f, 1.088f, 1.986f, 0.745f)
            curveToRelative(0.754f, -0.343f, 1.088f, -1.232f, 0.745f, -1.986f)
            lineToRelative(-5f, -11f)
            close()
        }
    }.build()
}
