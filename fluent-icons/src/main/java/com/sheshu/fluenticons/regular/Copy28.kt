package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Copy28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Copy28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 2f)
            curveTo(8.731f, 2f, 7.5f, 3.231f, 7.5f, 4.75f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(10f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-16f)
            curveTo(23f, 3.231f, 21.769f, 2f, 20.25f, 2f)
            horizontalLineToRelative(-10f)
            close()
            moveTo(9f, 4.75f)
            curveTo(9f, 4.06f, 9.56f, 3.5f, 10.25f, 3.5f)
            horizontalLineToRelative(10f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-10f)
            curveTo(9.56f, 22f, 9f, 21.44f, 9f, 20.75f)
            verticalLineToRelative(-16f)
            close()
            moveTo(6.5f, 4.8f)
            curveTo(5.61f, 5.255f, 5f, 6.18f, 5f, 7.25f)
            verticalLineToRelative(13.5f)
            curveTo(5f, 23.65f, 7.35f, 26f, 10.25f, 26f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.069f, 0f, 1.995f, -0.61f, 2.45f, -1.5f)
            horizontalLineToRelative(-9.95f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineTo(4.8f)
            close()
        }
    }.build()
}
