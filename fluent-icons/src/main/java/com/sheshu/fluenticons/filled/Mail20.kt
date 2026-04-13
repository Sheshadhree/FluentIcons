package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mail20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 7.373f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 17f, 2f, 15.88f, 2f, 14.5f)
            verticalLineTo(7.373f)
            lineToRelative(7.746f, 4.558f)
            curveToRelative(0.157f, 0.092f, 0.351f, 0.092f, 0.508f, 0f)
            lineTo(18f, 7.373f)
            close()
            moveTo(15.5f, 4f)
            curveToRelative(1.287f, 0f, 2.347f, 0.973f, 2.485f, 2.223f)
            lineTo(10f, 10.92f)
            lineTo(2.015f, 6.223f)
            curveTo(2.153f, 4.973f, 3.213f, 4f, 4.5f, 4f)
            horizontalLineToRelative(11f)
            close()
        }
    }.build()
}
