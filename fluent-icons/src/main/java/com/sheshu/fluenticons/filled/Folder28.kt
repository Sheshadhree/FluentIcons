package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Folder28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Folder28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 4.679f, 3.679f, 3f, 5.75f, 3f)
            horizontalLineToRelative(3.672f)
            curveToRelative(0.729f, 0f, 1.428f, 0.29f, 1.944f, 0.805f)
            lineTo(13.25f, 5.69f)
            lineToRelative(-2.944f, 2.945f)
            curveTo(10.07f, 8.868f, 9.752f, 9f, 9.421f, 9f)
            horizontalLineTo(2f)
            verticalLineTo(6.75f)
            close()
            moveToRelative(0.004f, 3.75f)
            verticalLineToRelative(9.75f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineTo(22.25f)
            curveToRelative(2.07f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(9.75f)
            curveTo(26f, 7.679f, 24.32f, 6f, 22.25f, 6f)
            horizontalLineToRelative(-7.19f)
            lineToRelative(-3.695f, 3.694f)
            curveTo(10.85f, 10.21f, 10.151f, 10.5f, 9.422f, 10.5f)
            horizontalLineTo(2.004f)
            close()
        }
    }.build()
}
