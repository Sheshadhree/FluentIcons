package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAddSpaceAfter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAddSpaceAfter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.75f)
            curveTo(3f, 6.336f, 3.336f, 6f, 3.75f, 6f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 6f, 21f, 6.336f, 21f, 6.75f)
            reflectiveCurveTo(20.664f, 7.5f, 20.25f, 7.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 7.5f, 3f, 7.164f, 3f, 6.75f)
            close()
            moveToRelative(0f, 6f)
            curveTo(3f, 12.336f, 3.336f, 12f, 3.75f, 12f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 13.5f, 3f, 13.164f, 3f, 12.75f)
            close()
            moveToRelative(6.47f, 5.47f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(12f, 17.81f)
            lineToRelative(1.47f, 1.47f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-2f, 2f)
            close()
        }
    }.build()
}
