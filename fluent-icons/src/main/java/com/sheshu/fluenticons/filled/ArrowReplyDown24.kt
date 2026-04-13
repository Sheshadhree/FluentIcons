package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowReplyDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReplyDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.704f, 8.706f)
            curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0f, -1.415f)
            curveToRelative(-0.392f, -0.39f, -1.025f, -0.39f, -1.415f, 0.001f)
            lineToRelative(-4.997f, 5.004f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.023f, 0f, 1.413f)
            lineToRelative(4.997f, 4.998f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.415f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(6.41f, 14f)
            horizontalLineTo(13f)
            curveToRelative(4.335f, 0f, 7.864f, -3.448f, 7.996f, -7.75f)
            lineTo(21f, 6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            curveToRelative(0f, 3.238f, -2.566f, 5.878f, -5.775f, 5.996f)
            lineTo(13f, 12f)
            horizontalLineTo(6.414f)
            lineToRelative(3.29f, -3.294f)
            close()
        }
    }.build()
}
