package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 21f)
            horizontalLineToRelative(1.75f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(16f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(0f, -6.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(-1.5f, -5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            close()
            moveTo(16f, 8f)
            horizontalLineToRelative(5f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(16f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(-1.5f, -5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            verticalLineTo(3.75f)
            curveToRelative(0f, -0.199f, 0.079f, -0.39f, 0.22f, -0.53f)
            curveTo(9.86f, 3.079f, 10.05f, 3f, 10.25f, 3f)
            horizontalLineToRelative(4.25f)
            close()
            moveToRelative(0f, 13f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-4.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(16f)
            horizontalLineToRelative(5f)
            close()
            moveTo(4.5f, 3.75f)
            curveTo(4.5f, 3.336f, 4.164f, 3f, 3.75f, 3f)
            reflectiveCurveTo(3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(16.5f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
        }
    }.build()
}
