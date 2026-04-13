package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PollHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PollHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 11.752f)
            curveToRelative(0f, 1.52f, -1.232f, 2.752f, -2.752f, 2.752f)
            horizontalLineTo(4.75f)
            curveToRelative(-1.52f, 0f, -2.752f, -1.232f, -2.752f, -2.752f)
            curveTo(1.998f, 10.232f, 3.23f, 9f, 4.75f, 9f)
            horizontalLineToRelative(14.498f)
            curveTo(20.768f, 9f, 22f, 10.232f, 22f, 11.752f)
            close()
            moveToRelative(-5f, 7f)
            curveToRelative(0f, 1.52f, -1.232f, 2.752f, -2.752f, 2.752f)
            horizontalLineTo(4.75f)
            curveToRelative(-1.52f, 0f, -2.752f, -1.232f, -2.752f, -2.752f)
            curveTo(1.998f, 17.232f, 3.23f, 16f, 4.75f, 16f)
            horizontalLineToRelative(9.498f)
            curveTo(15.768f, 16f, 17f, 17.232f, 17f, 18.752f)
            close()
            moveToRelative(-5f, -14f)
            curveToRelative(0f, 1.52f, -1.232f, 2.752f, -2.752f, 2.752f)
            horizontalLineTo(4.75f)
            curveToRelative(-1.52f, 0f, -2.752f, -1.232f, -2.752f, -2.752f)
            curveTo(1.998f, 3.232f, 3.23f, 2f, 4.75f, 2f)
            horizontalLineToRelative(4.498f)
            curveTo(10.768f, 2f, 12f, 3.232f, 12f, 4.752f)
            close()
        }
    }.build()
}
