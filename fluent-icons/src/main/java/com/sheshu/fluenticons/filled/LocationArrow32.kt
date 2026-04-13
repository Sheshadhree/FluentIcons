package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrow32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.277f, 3.138f)
            curveToRelative(1.618f, -0.622f, 3.207f, 0.967f, 2.585f, 2.585f)
            lineToRelative(-8.46f, 21.994f)
            curveToRelative(-0.696f, 1.812f, -3.306f, 1.668f, -3.8f, -0.209f)
            lineToRelative(-2.375f, -9.023f)
            curveToRelative(-0.091f, -0.348f, -0.363f, -0.62f, -0.712f, -0.712f)
            lineToRelative(-9.023f, -2.375f)
            curveToRelative(-1.877f, -0.494f, -2.02f, -3.104f, -0.209f, -3.8f)
            lineToRelative(21.994f, -8.46f)
            close()
        }
    }.build()
}
