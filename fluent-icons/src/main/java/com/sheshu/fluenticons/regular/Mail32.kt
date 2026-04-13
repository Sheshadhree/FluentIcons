package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mail32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mail32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5f)
            curveTo(4.015f, 5f, 2f, 7.015f, 2f, 9.5f)
            verticalLineToRelative(13f)
            curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-13f)
            curveTo(30f, 7.015f, 27.985f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-19f)
            close()
            moveTo(28f, 10.403f)
            lineToRelative(-12f, 6.461f)
            lineToRelative(-12f, -6.461f)
            verticalLineTo(9.5f)
            curveTo(4f, 8.12f, 5.12f, 7f, 6.5f, 7f)
            horizontalLineToRelative(19f)
            curveTo(26.88f, 7f, 28f, 8.12f, 28f, 9.5f)
            verticalLineToRelative(0.903f)
            close()
            moveTo(4f, 12.674f)
            lineToRelative(11.526f, 6.207f)
            curveToRelative(0.296f, 0.159f, 0.652f, 0.159f, 0.948f, 0f)
            lineTo(28f, 12.674f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-19f)
            curveTo(5.12f, 25f, 4f, 23.88f, 4f, 22.5f)
            verticalLineToRelative(-9.826f)
            close()
        }
    }.build()
}
