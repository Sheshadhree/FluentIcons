package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cursor20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cursor20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 3.058f)
            curveToRelative(0f, -0.845f, 0.983f, -1.308f, 1.636f, -0.77f)
            lineToRelative(11.006f, 9.062f)
            curveToRelative(0.724f, 0.596f, 0.302f, 1.772f, -0.636f, 1.772f)
            horizontalLineToRelative(-5.592f)
            curveToRelative(-0.435f, 0f, -0.85f, 0.189f, -1.134f, 0.518f)
            lineToRelative(-3.524f, 4.073f)
            curveTo(6.15f, 18.412f, 5f, 17.983f, 5f, 17.057f)
            verticalLineTo(3.06f)
            close()
            moveToRelative(12.006f, 9.063f)
            lineTo(6f, 3.058f)
            verticalLineToRelative(14f)
            lineToRelative(3.524f, -4.073f)
            curveToRelative(0.475f, -0.549f, 1.165f, -0.864f, 1.89f, -0.864f)
            horizontalLineToRelative(5.592f)
            close()
        }
    }.build()
}
