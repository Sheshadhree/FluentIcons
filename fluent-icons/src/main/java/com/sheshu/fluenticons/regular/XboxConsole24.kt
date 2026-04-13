package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.XboxConsole24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.XboxConsole24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 5.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(8f, 6.164f, 8f, 5.75f)
            reflectiveCurveTo(8.336f, 5f, 8.75f, 5f)
            reflectiveCurveTo(9.5f, 5.336f, 9.5f, 5.75f)
            close()
            moveTo(5.75f, 2f)
            curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
            verticalLineToRelative(18.5f)
            curveTo(5f, 21.664f, 5.336f, 22f, 5.75f, 22f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.75f)
            curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
            horizontalLineTo(5.75f)
            close()
            moveTo(9.5f, 20.5f)
            verticalLineToRelative(-8.75f)
            curveTo(9.5f, 11.336f, 9.164f, 11f, 8.75f, 11f)
            reflectiveCurveTo(8f, 11.336f, 8f, 11.75f)
            verticalLineToRelative(8.75f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(-17f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(17f)
            horizontalLineToRelative(-8f)
            close()
        }
    }.build()
}
