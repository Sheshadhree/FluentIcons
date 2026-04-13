package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextFirstLine20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextFirstLine20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.72f, 2.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-0.97f, 0.97f)
            lineToRelative(0.97f, 0.97f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(1.5f, -1.5f)
            close()
            moveTo(3.75f, 3.5f)
            horizontalLineToRelative(7.5f)
            curveTo(11.664f, 3.5f, 12f, 3.836f, 12f, 4.25f)
            reflectiveCurveTo(11.664f, 5f, 11.25f, 5f)
            horizontalLineToRelative(-7.5f)
            curveTo(3.336f, 5f, 3f, 4.664f, 3f, 4.25f)
            reflectiveCurveTo(3.336f, 3.5f, 3.75f, 3.5f)
            close()
            moveToRelative(12.5f, 10f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(16.664f, 15f, 16.25f, 15f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 15f, 3f, 14.664f, 3f, 14.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(12.5f)
            close()
            moveTo(3.75f, 10f)
            horizontalLineToRelative(12.5f)
            curveTo(16.664f, 10f, 17f, 9.664f, 17f, 9.25f)
            reflectiveCurveTo(16.664f, 8.5f, 16.25f, 8.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 8.5f, 3f, 8.836f, 3f, 9.25f)
            reflectiveCurveTo(3.336f, 10f, 3.75f, 10f)
            close()
        }
    }.build()
}
