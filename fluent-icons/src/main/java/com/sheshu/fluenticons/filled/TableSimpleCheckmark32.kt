package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleCheckmark32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleCheckmark32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(12f)
            verticalLineTo(3f)
            close()
            moveTo(3f, 24.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(12f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            close()
            moveTo(17f, 29f)
            verticalLineTo(17f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(17f)
            close()
            moveTo(29f, 7.5f)
            verticalLineTo(15f)
            horizontalLineTo(17f)
            verticalLineTo(3f)
            horizontalLineToRelative(7.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            close()
            moveToRelative(-2.543f, 14.457f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(22f, 23.586f)
            lineToRelative(-1.293f, -1.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(2f, 2f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(3.75f, -3.75f)
            close()
        }
    }.build()
}
