package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrow32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(28.863f, 5.723f)
            curveToRelative(0.622f, -1.618f, -0.967f, -3.207f, -2.584f, -2.585f)
            lineToRelative(-21.995f, 8.46f)
            curveToRelative(-1.812f, 0.696f, -1.668f, 3.306f, 0.21f, 3.8f)
            lineToRelative(9.022f, 2.375f)
            curveToRelative(0.348f, 0.091f, 0.62f, 0.364f, 0.713f, 0.712f)
            lineToRelative(2.374f, 9.023f)
            curveToRelative(0.494f, 1.877f, 3.104f, 2.02f, 3.8f, 0.209f)
            lineToRelative(8.46f, -21.994f)
            close()
            moveToRelative(-1.866f, -0.718f)
            lineToRelative(-8.46f, 21.994f)
            lineToRelative(-2.374f, -9.023f)
            curveToRelative(-0.276f, -1.046f, -1.092f, -1.863f, -2.138f, -2.138f)
            lineToRelative(-9.023f, -2.374f)
            lineToRelative(21.994f, -8.46f)
            close()
        }
    }.build()
}
