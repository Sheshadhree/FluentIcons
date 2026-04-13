package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Trophy16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Trophy16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.999f, 3f)
            horizontalLineTo(3.496f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.252f, 0.922f, 2.288f, 2.122f, 2.471f)
            curveToRelative(0.394f, 1.583f, 1.732f, 2.792f, 3.381f, 2.998f)
            verticalLineTo(12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.104f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(0.504f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(14f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-1.03f)
            curveToRelative(1.65f, -0.207f, 2.987f, -1.416f, 3.381f, -2.999f)
            curveTo(13.08f, 7.787f, 14f, 6.751f, 14f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(14f, 3.672f, 13.329f, 3f, 12.5f, 3f)
            horizontalLineTo(12f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 1f, 4f, 1.895f, 4f, 3f)
            close()
            moveToRelative(8f, 1f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.653f, -0.417f, 1.208f, -1f, 1.414f)
            verticalLineTo(4f)
            close()
            moveToRelative(-8f, 0f)
            verticalLineToRelative(2.915f)
            curveTo(3.415f, 6.709f, 2.996f, 6.153f, 2.996f, 5.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
