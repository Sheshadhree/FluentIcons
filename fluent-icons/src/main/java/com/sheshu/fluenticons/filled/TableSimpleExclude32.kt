package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleExclude32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleExclude32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            horizontalLineTo(12f)
            verticalLineToRelative(10f)
            horizontalLineTo(2f)
            verticalLineTo(6.5f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            close()
            moveTo(2f, 14f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineTo(12f)
            verticalLineTo(14f)
            horizontalLineTo(2f)
            close()
            moveToRelative(21.5f, -2f)
            verticalLineTo(6.5f)
            curveTo(23.5f, 4.015f, 21.485f, 2f, 19f, 2f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(9.5f)
            close()
            moveTo(16f, 19f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-8f)
            close()
        }
    }.build()
}
