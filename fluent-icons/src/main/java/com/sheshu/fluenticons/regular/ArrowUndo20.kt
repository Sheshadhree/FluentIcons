package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUndo20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUndo20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.5f)
            curveTo(5f, 2.224f, 4.776f, 2f, 4.5f, 2f)
            reflectiveCurveTo(4f, 2.224f, 4f, 2.5f)
            verticalLineToRelative(4.9f)
            curveTo(4f, 7.731f, 4.269f, 8f, 4.6f, 8f)
            horizontalLineToRelative(4.9f)
            curveTo(9.776f, 8f, 10f, 7.776f, 10f, 7.5f)
            reflectiveCurveTo(9.776f, 7f, 9.5f, 7f)
            horizontalLineTo(5.906f)
            lineToRelative(3.473f, -3.019f)
            curveToRelative(1.667f, -1.45f, 4.194f, -1.272f, 5.643f, 0.395f)
            curveToRelative(1.45f, 1.667f, 1.272f, 4.194f, -0.395f, 5.643f)
            lineToRelative(-8.172f, 7.104f)
            curveToRelative(-0.208f, 0.18f, -0.23f, 0.497f, -0.049f, 0.705f)
            curveToRelative(0.181f, 0.208f, 0.497f, 0.23f, 0.705f, 0.05f)
            lineToRelative(8.172f, -7.104f)
            curveToRelative(2.084f, -1.812f, 2.305f, -4.97f, 0.494f, -7.054f)
            curveToRelative(-1.812f, -2.084f, -4.97f, -2.305f, -7.054f, -0.494f)
            lineTo(5f, 6.463f)
            verticalLineTo(2.5f)
            close()
        }
    }.build()
}
