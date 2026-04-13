package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShapeUnion16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShapeUnion16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 2f)
            curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(1.143f, 1f)
            lineTo(3f, 5.143f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.143f)
            close()
            moveTo(3f, 6.557f)
            lineTo(6.557f, 3f)
            horizontalLineToRelative(1.586f)
            lineTo(3f, 8.143f)
            verticalLineTo(6.557f)
            close()
            moveToRelative(6.45f, -3.45f)
            curveTo(9.776f, 3.272f, 10f, 3.61f, 10f, 4f)
            verticalLineToRelative(0.293f)
            lineTo(4.293f, 10f)
            horizontalLineTo(4f)
            curveToRelative(-0.39f, 0f, -0.728f, -0.224f, -0.893f, -0.55f)
            lineTo(9.45f, 3.107f)
            close()
            moveToRelative(0.55f, 2.6f)
            verticalLineTo(6f)
            horizontalLineToRelative(1.293f)
            lineTo(6f, 11.293f)
            verticalLineTo(10f)
            horizontalLineTo(5.707f)
            lineTo(10f, 5.707f)
            close()
            moveToRelative(-3.838f, 6.839f)
            lineToRelative(6.384f, -6.384f)
            curveTo(12.819f, 6.34f, 13f, 6.649f, 13f, 7f)
            verticalLineToRelative(0.293f)
            lineTo(7.293f, 13f)
            horizontalLineTo(7f)
            curveToRelative(-0.351f, 0f, -0.66f, -0.18f, -0.838f, -0.454f)
            close()
            moveTo(13f, 8.707f)
            verticalLineToRelative(1.586f)
            lineTo(10.293f, 13f)
            horizontalLineTo(8.707f)
            lineTo(13f, 8.707f)
            close()
            moveToRelative(0f, 3f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-0.293f)
            lineTo(13f, 11.707f)
            close()
        }
    }.build()
}
