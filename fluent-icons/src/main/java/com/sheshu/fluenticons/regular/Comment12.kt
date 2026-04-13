package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Comment12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Comment12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6.651f)
            lineToRelative(-2.874f, 1.916f)
            curveToRelative(-0.153f, 0.102f, -0.35f, 0.112f, -0.513f, 0.025f)
            curveTo(3.102f, 10.854f, 3f, 10.684f, 3f, 10.5f)
            verticalLineTo(9f)
            curveTo(1.895f, 9f, 1f, 8.105f, 1f, 7f)
            verticalLineTo(3f)
            close()
            moveToRelative(2f, -1f)
            curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(0.5f)
            curveTo(3.776f, 8f, 4f, 8.224f, 4f, 8.5f)
            verticalLineToRelative(1.066f)
            lineToRelative(2.223f, -1.482f)
            curveTo(6.305f, 8.029f, 6.4f, 8f, 6.5f, 8f)
            horizontalLineTo(9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
