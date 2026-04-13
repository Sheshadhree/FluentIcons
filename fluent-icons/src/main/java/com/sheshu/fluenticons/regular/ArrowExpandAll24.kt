package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExpandAll24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExpandAll24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.75f)
            curveTo(2f, 4.336f, 2.336f, 4f, 2.75f, 4f)
            horizontalLineToRelative(18.5f)
            curveTo(21.664f, 4f, 22f, 4.336f, 22f, 4.75f)
            reflectiveCurveTo(21.664f, 5.5f, 21.25f, 5.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5.5f, 2f, 5.164f, 2f, 4.75f)
            close()
            moveToRelative(10f, 4f)
            curveTo(12f, 8.336f, 12.336f, 8f, 12.75f, 8f)
            horizontalLineToRelative(8.5f)
            curveTo(21.664f, 8f, 22f, 8.336f, 22f, 8.75f)
            reflectiveCurveTo(21.664f, 9.5f, 21.25f, 9.5f)
            horizontalLineToRelative(-8.5f)
            curveTo(12.336f, 9.5f, 12f, 9.164f, 12f, 8.75f)
            close()
            moveTo(7.28f, 19.78f)
            curveTo(7.14f, 19.921f, 6.95f, 20f, 6.75f, 20f)
            reflectiveCurveToRelative(-0.39f, -0.079f, -0.53f, -0.22f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(6f, 17.44f)
            verticalLineTo(8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            reflectiveCurveTo(7.5f, 8.336f, 7.5f, 8.75f)
            verticalLineToRelative(8.69f)
            lineToRelative(1.72f, -1.72f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-3f, 3f)
            close()
        }
    }.build()
}
