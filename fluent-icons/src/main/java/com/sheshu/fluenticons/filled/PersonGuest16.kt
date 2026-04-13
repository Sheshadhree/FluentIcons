package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonGuest16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonGuest16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-6f, 7f)
            curveToRelative(0f, 0.35f, 0.062f, 0.684f, 0.172f, 0.996f)
            curveTo(7.115f, 13.998f, 7.058f, 14f, 7f, 14f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineTo(7f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(3.5f, -5f)
            curveTo(10.224f, 8f, 10f, 8.224f, 10f, 8.5f)
            reflectiveCurveTo(10.224f, 9f, 10.5f, 9f)
            horizontalLineToRelative(2f)
            curveTo(12.776f, 9f, 13f, 8.776f, 13f, 8.5f)
            reflectiveCurveTo(12.776f, 8f, 12.5f, 8f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(7f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            curveToRelative(0f, 0.269f, -0.041f, 0.527f, -0.113f, 0.772f)
            curveTo(8.495f, 5.16f, 7.552f, 5.94f, 7.177f, 6.99f)
            curveTo(7.118f, 6.994f, 7.06f, 7f, 7f, 7f)
            curveTo(5.481f, 7f, 4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
        }
    }.build()
}
