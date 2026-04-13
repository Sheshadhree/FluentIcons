package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpload16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpload16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2f)
            curveTo(3.336f, 2f, 3f, 2.336f, 3f, 2.75f)
            reflectiveCurveTo(3.336f, 3.5f, 3.75f, 3.5f)
            horizontalLineToRelative(8.5f)
            curveTo(12.664f, 3.5f, 13f, 3.164f, 13f, 2.75f)
            reflectiveCurveTo(12.664f, 2f, 12.25f, 2f)
            horizontalLineToRelative(-8.5f)
            close()
            moveToRelative(4.78f, 2.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(4.22f, 7.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.97f, -1.97f)
            verticalLineToRelative(6.19f)
            curveTo(7.25f, 13.664f, 7.586f, 14f, 8f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(7.06f)
            lineToRelative(1.97f, 1.97f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(8.53f, 4.72f)
            close()
        }
    }.build()
}
