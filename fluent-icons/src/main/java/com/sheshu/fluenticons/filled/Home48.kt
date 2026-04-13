package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Home48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Home48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.394f, 5.855f)
            curveToRelative(-1.399f, -1.14f, -3.39f, -1.14f, -4.788f, 0f)
            lineTo(8.431f, 16.597f)
            curveTo(7.527f, 17.334f, 7f, 18.449f, 7f, 19.628f)
            verticalLineToRelative(19.485f)
            curveTo(7f, 41.26f, 8.713f, 43f, 10.825f, 43f)
            horizontalLineToRelative(4.35f)
            curveTo(17.288f, 43f, 19f, 41.26f, 19f, 39.113f)
            verticalLineTo(30.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(8.613f)
            curveTo(29f, 41.26f, 30.712f, 43f, 32.825f, 43f)
            horizontalLineToRelative(4.35f)
            curveTo(39.288f, 43f, 41f, 41.26f, 41f, 39.113f)
            verticalLineTo(19.628f)
            curveToRelative(0f, -1.179f, -0.526f, -2.294f, -1.431f, -3.031f)
            lineTo(26.394f, 5.855f)
            close()
        }
    }.build()
}
