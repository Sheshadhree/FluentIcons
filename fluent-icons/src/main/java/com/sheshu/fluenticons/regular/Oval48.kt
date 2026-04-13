package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Oval48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Oval48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 24f)
            curveToRelative(0f, -8.284f, 6.716f, -15f, 15f, -15f)
            horizontalLineToRelative(10f)
            curveToRelative(8.284f, 0f, 15f, 6.716f, 15f, 15f)
            curveToRelative(0f, 8.284f, -6.716f, 15f, -15f, 15f)
            horizontalLineTo(19f)
            curveToRelative(-8.284f, 0f, -15f, -6.716f, -15f, -15f)
            close()
            moveToRelative(15f, -12.5f)
            curveToRelative(-6.904f, 0f, -12.5f, 5.596f, -12.5f, 12.5f)
            reflectiveCurveTo(12.096f, 36.5f, 19f, 36.5f)
            horizontalLineToRelative(10f)
            curveToRelative(6.904f, 0f, 12.5f, -5.596f, 12.5f, -12.5f)
            reflectiveCurveTo(35.904f, 11.5f, 29f, 11.5f)
            horizontalLineTo(19f)
            close()
        }
    }.build()
}
