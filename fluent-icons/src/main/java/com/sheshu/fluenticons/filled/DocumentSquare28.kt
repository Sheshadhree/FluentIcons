package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentSquare28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSquare28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 10.25f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineTo(25f)
            verticalLineToRelative(9.25f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 25f, 3f, 23.769f, 3f, 22.25f)
            verticalLineTo(5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineTo(15f)
            verticalLineToRelative(7.25f)
            close()
            moveToRelative(1.5f, -7.028f)
            curveToRelative(0.32f, 0.136f, 0.615f, 0.333f, 0.866f, 0.584f)
            lineToRelative(6.828f, 6.828f)
            curveToRelative(0.251f, 0.25f, 0.448f, 0.546f, 0.584f, 0.866f)
            horizontalLineTo(17.75f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(3.222f)
            close()
        }
    }.build()
}
