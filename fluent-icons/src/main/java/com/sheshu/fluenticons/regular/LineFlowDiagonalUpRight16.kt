package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineFlowDiagonalUpRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineFlowDiagonalUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.854f, 3.853f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(5.88f, 9.415f)
            curveTo(5.484f, 9.152f, 5.009f, 9f, 4.5f, 9f)
            curveTo(3.12f, 9f, 2f, 10.12f, 2f, 11.5f)
            reflectiveCurveTo(3.12f, 14f, 4.5f, 14f)
            reflectiveCurveTo(7f, 12.88f, 7f, 11.5f)
            curveToRelative(0f, -0.51f, -0.152f, -0.983f, -0.414f, -1.379f)
            lineToRelative(6.268f, -6.268f)
            close()
            moveTo(3f, 11.5f)
            curveTo(3f, 10.672f, 3.672f, 10f, 4.5f, 10f)
            reflectiveCurveTo(6f, 10.672f, 6f, 11.5f)
            reflectiveCurveTo(5.328f, 13f, 4.5f, 13f)
            reflectiveCurveTo(3f, 12.328f, 3f, 11.5f)
            close()
        }
    }.build()
}
