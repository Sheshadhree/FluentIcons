package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataFunnel24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataFunnel24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.248f, 7.504f)
            curveToRelative(1.52f, 0f, 2.752f, -1.232f, 2.752f, -2.752f)
            curveTo(22f, 3.232f, 20.768f, 2f, 19.248f, 2f)
            horizontalLineTo(4.75f)
            curveTo(3.23f, 2f, 1.998f, 3.232f, 1.998f, 4.752f)
            curveToRelative(0f, 1.52f, 1.232f, 2.752f, 2.752f, 2.752f)
            horizontalLineToRelative(14.498f)
            close()
            moveToRelative(-2f, 7f)
            curveToRelative(1.52f, 0f, 2.752f, -1.232f, 2.752f, -2.752f)
            curveTo(20f, 10.232f, 18.768f, 9f, 17.248f, 9f)
            horizontalLineTo(6.75f)
            curveToRelative(-1.52f, 0f, -2.752f, 1.232f, -2.752f, 2.752f)
            curveToRelative(0f, 1.52f, 1.232f, 2.752f, 2.752f, 2.752f)
            horizontalLineToRelative(10.498f)
            close()
            moveTo(17f, 18.752f)
            curveTo(17f, 17.232f, 15.768f, 16f, 14.248f, 16f)
            horizontalLineTo(9.75f)
            curveToRelative(-1.52f, 0f, -2.752f, 1.232f, -2.752f, 2.752f)
            curveToRelative(0f, 1.52f, 1.232f, 2.752f, 2.751f, 2.752f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.519f, 0f, 2.751f, -1.232f, 2.751f, -2.752f)
            close()
        }
    }.build()
}
