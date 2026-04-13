package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.429f, 11.864f)
            curveToRelative(0.663f, 0.461f, 1.57f, -0.013f, 1.57f, -0.821f)
            verticalLineTo(4.957f)
            curveToRelative(0f, -0.808f, -0.907f, -1.282f, -1.57f, -0.821f)
            lineTo(5.644f, 6.769f)
            curveToRelative(-0.857f, 0.596f, -0.857f, 1.865f, 0f, 2.462f)
            lineToRelative(3.785f, 2.633f)
            close()
            moveToRelative(0.57f, -0.821f)
            lineTo(6.216f, 8.41f)
            curveToRelative(-0.285f, -0.199f, -0.285f, -0.622f, 0f, -0.82f)
            lineTo(10f, 4.956f)
            verticalLineToRelative(6.086f)
            close()
        }
    }.build()
}
