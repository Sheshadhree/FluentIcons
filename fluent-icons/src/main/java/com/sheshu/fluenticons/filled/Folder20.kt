package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Folder20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Folder20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.5f)
            curveTo(2f, 4.12f, 3.12f, 3f, 4.5f, 3f)
            horizontalLineToRelative(2.482f)
            curveToRelative(0.464f, 0f, 0.91f, 0.184f, 1.238f, 0.513f)
            lineToRelative(1.28f, 1.28f)
            lineToRelative(-2.06f, 2.06f)
            curveTo(7.345f, 6.948f, 7.217f, 7f, 7.085f, 7f)
            horizontalLineTo(2f)
            verticalLineTo(5.5f)
            close()
            moveTo(2f, 8f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 15.88f, 3.12f, 17f, 4.5f, 17f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(18f, 6.12f, 16.88f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-4.793f)
            lineToRelative(-2.56f, 2.56f)
            curveTo(7.864f, 7.843f, 7.483f, 8f, 7.085f, 8f)
            horizontalLineTo(2f)
            close()
        }
    }.build()
}
