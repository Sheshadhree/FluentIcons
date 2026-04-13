package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Poll24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Poll24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.752f, 2f)
            curveToRelative(1.52f, 0f, 2.752f, 1.232f, 2.752f, 2.752f)
            verticalLineTo(19.25f)
            curveToRelative(0f, 1.52f, -1.232f, 2.752f, -2.752f, 2.752f)
            curveTo(10.232f, 22.002f, 9f, 20.77f, 9f, 19.25f)
            verticalLineTo(4.752f)
            curveTo(9f, 3.232f, 10.232f, 2f, 11.752f, 2f)
            close()
            moveToRelative(7f, 5f)
            curveToRelative(1.52f, 0f, 2.752f, 1.232f, 2.752f, 2.752f)
            verticalLineToRelative(9.498f)
            curveToRelative(0f, 1.52f, -1.232f, 2.752f, -2.752f, 2.752f)
            curveToRelative(-1.52f, 0f, -2.752f, -1.232f, -2.752f, -2.752f)
            verticalLineTo(9.752f)
            curveTo(16f, 8.232f, 17.232f, 7f, 18.752f, 7f)
            close()
            moveToRelative(-14f, 5f)
            curveToRelative(1.52f, 0f, 2.752f, 1.232f, 2.752f, 2.752f)
            verticalLineToRelative(4.498f)
            curveToRelative(0f, 1.52f, -1.232f, 2.752f, -2.752f, 2.752f)
            curveTo(3.232f, 22.002f, 2f, 20.77f, 2f, 19.25f)
            verticalLineToRelative(-4.498f)
            curveTo(2f, 13.232f, 3.232f, 12f, 4.752f, 12f)
            close()
        }
    }.build()
}
