package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CommentMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 9.005f)
            verticalLineToRelative(1.727f)
            curveTo(14.598f, 10.387f, 15f, 9.74f, 15f, 9f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(5f)
            curveTo(4.26f, 2f, 3.613f, 2.402f, 3.268f, 3f)
            horizontalLineTo(11f)
            curveToRelative(0.596f, 0f, 1.152f, 0.174f, 1.62f, 0.474f)
            curveTo(13.45f, 4.008f, 14f, 4.939f, 14f, 6f)
            verticalLineToRelative(3.005f)
            close()
            moveTo(3f, 4f)
            curveTo(1.895f, 4f, 1f, 4.895f, 1f, 6f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            verticalLineToRelative(0.998f)
            curveToRelative(0f, 0.817f, 0.927f, 1.29f, 1.588f, 0.809f)
            lineTo(7.073f, 13f)
            horizontalLineTo(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(3f)
            close()
            moveTo(2f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6.747f)
            lineTo(4f, 13.998f)
            verticalLineTo(12f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
