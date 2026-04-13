package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextAddSpaceAfter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAddSpaceAfter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            horizontalLineToRelative(12.5f)
            curveTo(16.664f, 5f, 17f, 5.336f, 17f, 5.75f)
            reflectiveCurveTo(16.664f, 6.5f, 16.25f, 6.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 6.5f, 3f, 6.164f, 3f, 5.75f)
            close()
            moveToRelative(0f, 4f)
            curveTo(3f, 9.336f, 3.336f, 9f, 3.75f, 9f)
            horizontalLineToRelative(12.5f)
            curveTo(16.664f, 9f, 17f, 9.336f, 17f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 10.5f, 3f, 10.164f, 3f, 9.75f)
            close()
            moveToRelative(9.03f, 6.03f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(10f, 14.81f)
            lineToRelative(0.97f, 0.97f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            close()
        }
    }.build()
}
