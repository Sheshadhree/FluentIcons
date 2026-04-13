package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSquareDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSquareDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(13f)
            curveTo(3f, 19.88f, 4.12f, 21f, 5.5f, 21f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-13f)
            curveTo(21f, 4.12f, 19.88f, 3f, 18.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(11.03f, 8.72f)
            curveToRelative(0.267f, 0.267f, 0.29f, 0.683f, 0.073f, 0.977f)
            lineTo(16.53f, 12.78f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.267f, 0.267f, -0.683f, 0.291f, -0.977f, 0.073f)
            lineToRelative(-0.084f, -0.072f)
            lineToRelative(-4f, -4.002f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineTo(8.53f, 11.72f)
            lineToRelative(2.72f, 2.722f)
            verticalLineTo(7.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(12f, 7f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(12.75f, 7.75f)
            verticalLineToRelative(6.69f)
            lineToRelative(2.72f, -2.72f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.072f)
            lineToRelative(0.084f, 0.072f)
            close()
        }
    }.build()
}
