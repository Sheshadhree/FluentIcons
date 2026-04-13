package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentSquare48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSquare48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26f, 17.75f)
            curveToRelative(0f, 2.347f, 1.903f, 4.25f, 4.25f, 4.25f)
            horizontalLineTo(42f)
            verticalLineToRelative(15.75f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-27.5f)
            curveTo(7.903f, 42f, 6f, 40.097f, 6f, 37.75f)
            verticalLineToRelative(-27.5f)
            curveTo(6f, 7.903f, 7.903f, 6f, 10.25f, 6f)
            horizontalLineTo(26f)
            verticalLineToRelative(11.75f)
            close()
            moveToRelative(2.5f, -11.375f)
            curveToRelative(0.466f, 0.21f, 0.895f, 0.502f, 1.263f, 0.87f)
            lineToRelative(10.992f, 10.992f)
            curveToRelative(0.368f, 0.368f, 0.66f, 0.797f, 0.869f, 1.263f)
            horizontalLineTo(30.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(6.375f)
            close()
        }
    }.build()
}
