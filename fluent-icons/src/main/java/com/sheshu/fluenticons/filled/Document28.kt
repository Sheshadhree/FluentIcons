package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Document28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Document28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(7.999f)
            lineTo(24f, 12.078f)
            verticalLineTo(23.6f)
            curveToRelative(0f, 1.325f, -1.075f, 2.4f, -2.4f, 2.4f)
            horizontalLineTo(6.4f)
            curveTo(5.074f, 26f, 4f, 24.925f, 4f, 23.6f)
            verticalLineTo(4.4f)
            curveTo(4f, 3.074f, 5.074f, 2f, 6.4f, 2f)
            horizontalLineTo(14f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 2.475f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(7.502f)
            curveToRelative(-0.091f, -0.13f, -0.194f, -0.252f, -0.307f, -0.366f)
            lineToRelative(-7.431f, -7.431f)
            curveTo(15.68f, 2.62f, 15.593f, 2.544f, 15.5f, 2.475f)
            close()
        }
    }.build()
}
