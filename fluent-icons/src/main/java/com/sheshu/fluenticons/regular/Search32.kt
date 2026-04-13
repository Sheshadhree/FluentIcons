package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Search32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Search32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.894f, 22.308f)
            curveTo(18.895f, 23.988f, 16.316f, 25f, 13.5f, 25f)
            curveTo(7.149f, 25f, 2f, 19.851f, 2f, 13.5f)
            reflectiveCurveTo(7.149f, 2f, 13.5f, 2f)
            reflectiveCurveTo(25f, 7.149f, 25f, 13.5f)
            curveToRelative(0f, 2.828f, -1.021f, 5.418f, -2.715f, 7.421f)
            lineToRelative(0.023f, -0.027f)
            lineToRelative(6.4f, 6.399f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.391f, 0.39f, -1.024f, 0.39f, -1.415f, 0f)
            lineToRelative(-6.399f, -6.399f)
            close()
            moveTo(23f, 13.5f)
            curveTo(23f, 8.253f, 18.747f, 4f, 13.5f, 4f)
            reflectiveCurveTo(4f, 8.253f, 4f, 13.5f)
            reflectiveCurveTo(8.253f, 23f, 13.5f, 23f)
            reflectiveCurveToRelative(9.5f, -4.253f, 9.5f, -9.5f)
            close()
        }
    }.build()
}
