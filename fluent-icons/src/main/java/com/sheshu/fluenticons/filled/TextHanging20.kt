package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextHanging20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextHanging20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 3.5f)
            curveTo(3.336f, 3.5f, 3f, 3.836f, 3f, 4.25f)
            reflectiveCurveTo(3.336f, 5f, 3.75f, 5f)
            horizontalLineToRelative(12.5f)
            curveTo(16.664f, 5f, 17f, 4.664f, 17f, 4.25f)
            reflectiveCurveTo(16.664f, 3.5f, 16.25f, 3.5f)
            horizontalLineTo(3.75f)
            close()
            moveToRelative(5f, 10f)
            curveTo(8.336f, 13.5f, 8f, 13.836f, 8f, 14.25f)
            reflectiveCurveTo(8.336f, 15f, 8.75f, 15f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(8f, 9.25f)
            curveTo(8f, 8.836f, 8.336f, 8.5f, 8.75f, 8.5f)
            horizontalLineToRelative(7.5f)
            curveTo(16.664f, 8.5f, 17f, 8.836f, 17f, 9.25f)
            reflectiveCurveTo(16.664f, 10f, 16.25f, 10f)
            horizontalLineToRelative(-7.5f)
            curveTo(8.336f, 10f, 8f, 9.664f, 8f, 9.25f)
            close()
            moveToRelative(-3.72f, 1.47f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(0.97f, 0.97f)
            lineToRelative(-0.97f, 0.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-1.5f, -1.5f)
            close()
        }
    }.build()
}
